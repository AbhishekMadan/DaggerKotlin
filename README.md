# DaggerKotlin
Experimenting with dagger 2 in android Kotlin project

## Notes:

- @Component
  - Components are used to provide the dependencies required by components/objects whose lifecycle isn't controlled by the program but instead controlled by Android. eg: Activity, Fragment.
  
  
- @Module
  - In simple terms: Modules are used to clear confusions when providing dependencies.
  - If there are 2 classes extending an interface then module is used to define when to provide which class (using named qualifiers)
  - When using a third party dependency, module is used to create the third party classes for injection.
