## Toronto Scala User Group - March 19, 2013

Sample project for my talk "Abnorm: A better non-ORM".

Cloned from https://github.com/marconilanna/play-bootstrap

Slides available at https://speakerdeck.com/marconilanna/abnorm-a-better-non-orm.

### Highlights

* Abnorm: A better non-ORM. A thin, less verbose abstraction layer on top of Anorm
* A data access trait providing Active Record like behavior with minimal effort
* Externalized SQL statements
* Separate configuration environments for production, testing, and development
* Convenience handlers for static resources
* Uncompressed assets for easy debugging in dev; minified and gzipped in production
* jQuery via Google CDN with local fallback
* Bootstrap
* Font Awesome
* Optimized Google Analytics snippet
* The best ideas from HTML5 Boilerplate
* ScalaTest (replaces specs2)

### Getting Started

0. Edit the app name and version in `project/Build.scala`
0. Change the application secret in `conf/application.conf`
0. Edit the default database name in `conf/evolutions/default/0.sql`
0. Copy the file `conf/local.conf.default` to `conf/local.conf`
0. Set the database configuration parameters in `conf/local.conf` and `conf/local/*.conf`
0. Set the site name and Google Analytics ID in `app/views/layout/base.scala.html`
0. Replace favicon and Apple touch icons
0. Have fun!

#### Configuration environments

There are separate configuration environments for production, testing, and development,
each represented by a file in `conf/local/`. `conf/application.conf` includes `conf/local.conf`,
which in turn includes one of the files in `conf/local/`. To use the production configuration
environment, for instance, just edit `local.conf` and change the include to `conf/local/prod.conf`.

`conf/local.conf` is ignored by Git and thus can be freely edited locally. Sensitive information
such as usernames, passwords and API tokens must be put in `local.conf` to avoid commiting them
to source control.

### License

Copyright 2013 Marconi Lanna

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
