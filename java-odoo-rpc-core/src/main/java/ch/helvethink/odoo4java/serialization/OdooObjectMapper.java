/*
 * MIT License
 *
 * Copyright (c) 2024 Helvethink
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package ch.helvethink.odoo4java.serialization;

import ch.helvethink.odoo4java.models.OdooId;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.text.SimpleDateFormat;
import java.util.Date;

import static ch.helvethink.odoo4java.serialization.OdooDateDeserializer.DEFAULT_DATE_FORMAT;

/**
 * Our object mapper with custom deserializers
 */
public class OdooObjectMapper extends ObjectMapper {

    /**
     * Simple constructor
     */
    public OdooObjectMapper() {
        configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
        configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, false);
        configure(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES, false);
        final SimpleDateFormat df = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        setDateFormat(df);
        final SimpleModule module = new SimpleModule();
        module.addDeserializer(OdooId.class, new OdooIdDeserializer());
        module.addSerializer(OdooId.class, new OdooIdSerializer());
        module.addDeserializer(Date.class, new OdooDateDeserializer());
        registerModule(module);
    }

}
