/*
* Copyright (C) 2014 Validus Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.android.internal.util.validus;

import android.os.SystemProperties;

public class BuildInfo {

    private static final String BUILD_TYPE_PROP = "ro.validus.buildtype";
    private static final String SLIM_VERSION_PROP = "ro.validus.version";

    public static String getValidusBuildType() {
        return SystemProperties.get(BUILD_TYPE_PROP, "");
    }

    public static String getValidusVersion() {
        return SystemProperties.get(VALIDUS_VERSION_PROP, "");
    }
}