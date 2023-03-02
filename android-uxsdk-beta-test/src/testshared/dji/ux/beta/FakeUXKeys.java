/*
 * Copyright (c) 2018-2020 DJI
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

package dji.ux.beta;

import dji.ux.beta.core.communication.UXKeys;

public final class FakeUXKeys extends UXKeys {
    @UXParamKey(type = Integer.class, updateType = UpdateType.ON_CHANGE)
    public static final String TEST_KEY_1 = "TestKey1";

    @UXParamKey(type = Integer.class, updateType = UpdateType.ON_CHANGE)
    public static final String TEST_KEY_2 = "TestKey2";

    @UXParamKey(type = Integer.class, updateType = UpdateType.ON_CHANGE)
    public static final String TEST_KEY_3 = "TestKey3";

    @UXParamKey(type = Integer.class, updateType = UpdateType.ON_CHANGE)
    public static final String TEST_KEY_4 = "TestKey4";

    @UXParamKey(type = Integer.class, updateType = UpdateType.ON_CHANGE)
    public static final String TEST_KEY_5 = "TestKey5";

    @UXParamKey(type = Integer.class, updateType = UpdateType.ON_CHANGE)
    public static final String TEST_KEY_6 = "TestKey5";

    @UXParamKey(type = Character[].class, updateType = UpdateType.ON_CHANGE)
    public static final String TEST_KEY_7 = "TestKey7";

    @UXParamKey(type = Boolean.class, updateType = UpdateType.ON_CHANGE)
    public static final String TEST_KEY_8 = "TestKey8";

    @UXParamKey(type = Integer.class, updateType = UpdateType.ON_EVENT)
    public static final String TEST_KEY_9 = "TestKey9";

    private FakeUXKeys() {
        super();
    }
}