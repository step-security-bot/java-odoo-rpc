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

package ch.helvethink.odoo4java.jsonrpc;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Generate unique ids per thread
 */
public class ThreadBasedIdGenerator {
    /**
     * Thread count
     */
    private static final ConcurrentHashMap<Long, Integer> threadCounters = new ConcurrentHashMap<>();

    /**
     * Generate the id
     * @return the generated id
     */
    public static long generateId() {
        long threadId = Thread.currentThread().getId();
        long timestamp = System.currentTimeMillis();

        int counter = threadCounters.merge(threadId, 1, Integer::sum);

        // Combine timestamp, thread ID, and counter
        return (timestamp << 32) | (threadId << 16) | counter;
    }

}
