/*
 * Copyright 2019 ThoughtWorks, Inc.
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

package com.thoughtworks.go.apiv7.admin.shared.representers.configorigin;

import com.thoughtworks.go.api.base.OutputWriter;
import com.thoughtworks.go.config.remote.FileConfigOrigin;
import com.thoughtworks.go.spark.Routes;

import static com.thoughtworks.go.CurrentGoCDVersion.apiDocsUrl;

// This representer is only for serialization.

public class ConfigXmlOriginRepresenter {

  public static void toJSON(OutputWriter jsonWriter, FileConfigOrigin fileConfigOrigin) {
    jsonWriter.addLinks(linksWriter -> linksWriter
        .addLink("self", Routes.ConfigView.SELF)
        .addAbsoluteLink("doc", apiDocsUrl("#get-configuration")));
    jsonWriter.add("type", "gocd");
  }
}