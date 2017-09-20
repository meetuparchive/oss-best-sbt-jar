# oss-best-sbt-jar [![Build Status](https://travis-ci.org/meetup/oss-best-sbt-jar.svg?branch=master)](https://travis-ci.org/meetup/oss-best-sbt-jar)  [![Coverage Status](https://coveralls.io/repos/github/meetup/oss-best-sbt-jar/badge.svg?branch=master)](https://coveralls.io/github/meetup/oss-best-sbt-jar?branch=master) [ ![Download](https://api.bintray.com/packages/meetup/maven/oss-best-sbt-jar/images/download.svg) ](https://bintray.com/meetup/maven/oss-best-sbt-jar/_latestVersion)

Best practices project for an open sourced SBT project publishing a jar.

## Making a BEST OSS repo

Features this project has that yours should too:
- Makefile with `version`, `package` and `publish` targets
- Integration with Travis for CI & CDelivery
- CDeployment of artifacts to bintray
- Tagging of new published artifacts
- Standardized SBT project setup
- Unit testing & Component testing
- Code coverage reporting
- Badges
  - Build status
  - Coverage status
  - Bintray latest
- CHANGELOG
- README
- CODE_OF_CONDUCT
- LICENSE
- Repository write access for entire organization.
- Repository admin access for project owners.
- Master protected from pushing except for admins.

## Travis build should have the following env vars setup

* `BINTRAY_API_KEY`
* `BINTRAY_USER`
