/*
 * Copyright 2015-2017 Canoo Engineering AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.canoo.dolphin.test.qualifier;

import com.canoo.platform.remoting.DolphinBean;
import com.canoo.platform.remoting.Property;

@DolphinBean
public class QualifierTestModel {

    private Property<QualifierTestSubModelOne> subModelOneProperty;

    private Property<QualifierTestSubModelTwo> subModelTwoProperty;

    public Property<QualifierTestSubModelOne> subModelOneProperty() {
        return subModelOneProperty;
    }

    public Property<QualifierTestSubModelTwo> subModelTwoProperty() {
        return subModelTwoProperty;
    }
}