/*
 * Copyright 2014 Hiroki Uchida
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nikuyoshi.exception;

/**
 * <p>Abstract FiveHundredPixelsException class.</p>
 *
 * @author nikuyoshi
 * @version $Id: $
 */
public abstract class FiveHundredPixelsException extends Exception{

  private static final long serialVersionUID = -3488202601262476100L;

    /**
     * <p>Constructor for FiveHundredPixelsException.</p>
     */
    public FiveHundredPixelsException() {
        super();
    }

    /**
     * <p>Constructor for FiveHundredPixelsException.</p>
     *
     * @param message a {@link java.lang.String} object.
     */
    public FiveHundredPixelsException(String message) {
        super(message);
    }

    /**
     * <p>Constructor for FiveHundredPixelsException.</p>
     *
     * @param message a {@link java.lang.String} object.
     * @param cause a {@link java.lang.Throwable} object.
     */
    public FiveHundredPixelsException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * <p>Constructor for FiveHundredPixelsException.</p>
     *
     * @param cause a {@link java.lang.Throwable} object.
     */
    public FiveHundredPixelsException(Throwable cause) {
        super(cause);
    }

    /**
     * <p>Constructor for FiveHundredPixelsException.</p>
     *
     * @param message a {@link java.lang.String} object.
     * @param cause a {@link java.lang.Throwable} object.
     * @param enableSuppression a boolean.
     * @param writableStackTrace a boolean.
     */
    protected FiveHundredPixelsException(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
