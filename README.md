## Multi module project
* 1 step multimoduleproject/utils/tasks/build->build and /verification->test
* 2 step multimoduleproject/application/api/tasks/build->build and /verification->test

### Module utils
* Module created  'utils'
* Class created 'StringUtils' in the package 'ru.clevertec'
* Configured file build.gradle.
* Plugins were used: 'maven-publish' for storing the archive in a local repository
  and 'jacoco' for preparing test execution reports.
* You can check this by going to the directory '.m2\repository\ru\clevertec\utils\1.3.5'
* Add test.

### Module application
* Module created 'application'
* Modules created 'api' and 'core'
* Configured files build.gradle. In the file build.gradle of module 'core' connected 
  the library 'utils-1.3.5' using repository mavenLocal and dependency 'implementation 
  'ru.clevertec:utils:1.3.5''. For correct operation in submodule 'api' in the file
  build.gradle of module 'api' indicate dependency 
  implementation project(':application:core').
* In submodule 'api' in the package 'ru.clevertec' class created 'Utils'.
* Add test. 
* Plugins were used 'jacoco' for preparing test execution reports.

### Add TestReportPlugin
* Directory created 'buildSrc', inside created build.gradle. Update 'gradle' and 
module formed 'buildSrc'.
* Plugin were used 'groovy'.
* We create a class 'TestReportPlugin' in which we describe our plugin.
* The plugin checks whether folder 'reporttest' exists and then checks all submodules
  for test results.
* In menu gradle ->Tasks->build->report, group 'report' appears in the list of groups, 
  containing task of name 'report_test'.
* My plugin checks for the presence of folder of name 'reporttest', if it is in the 
  project, then in this folder it creates file '{name project}-test-report.txt' containing 
  text 'Tests for project {name project} have been completed.'.