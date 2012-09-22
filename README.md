## Licence
This software is licensed under the Apache 2 license, quoted below.

Copyright Schleichardt

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this project except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0.

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.




Source of Twitter Bootstrap:
Twitter, Inc.
https://github.com/twitter/bootstrap

## Usage
1. fork it and publish-local
2. add dependency in the app: "info.schleichardt" %% "play-2-twitter-bootstrap-integration" % "0.1-SNAPSHOT"
3. include:


    <link rel="stylesheet" media="screen" href='@routes.Assets.at("stylesheets/bootstrap.min.css")'>
    <link rel="stylesheet" media="screen" href='@routes.Assets.at("stylesheets/responsive.min.css")'>
    <script src='@routes.Assets.at("javascripts/bootstrap-dropdown.js")' type="text/javascript"></script>