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
package com.canoo.dp.impl.server.model;

import com.canoo.dp.impl.remoting.PresentationModelBuilderFactory;
import com.canoo.dp.impl.remoting.PresentationModelBuilder;
import com.canoo.dp.impl.platform.core.Assert;
import org.opendolphin.core.server.ServerDolphin;
import org.opendolphin.core.server.ServerPresentationModel;

public class ServerPresentationModelBuilderFactory implements PresentationModelBuilderFactory<ServerPresentationModel> {

    private final ServerDolphin dolphin;

    public ServerPresentationModelBuilderFactory(ServerDolphin dolphin) {
        Assert.requireNonNull(dolphin, "dolphin");
        this.dolphin = dolphin;
    }

    @Override
    public PresentationModelBuilder<ServerPresentationModel> createBuilder() {
        return new ServerPresentationModelBuilder(dolphin);
    }
}