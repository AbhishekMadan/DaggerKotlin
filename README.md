# DaggerKotlin
Experimenting with dagger 2 in android Kotlin project

## Notes:

- @Component
  - Components are used to provide the dependencies required by components/objects whose lifecycle isn't controlled by the program but instead controlled by Android. eg: Activity, Fragment.
  
  
- @Module
  - In simple terms: Modules are used to clear confusions when providing dependencies.
  - If there are 2 classes extending an interface then module is used to define when to provide which class (using named qualifiers)
  - When using a third party dependency, module is used to create the third party classes for injection.


- @Qualifiers / @Named
  - https://bloggie.io/@_junrong/dagger-2-for-android-part-iii-the-qualifier-and-named-annotation
  - Purpose if to qualify which dependency to inject if there are multiple constructs of the same type. ie if there are 5 derived classes from a subclass and the dependent class uses the super class to  hold he reference then dagger would get confused on which subclass to inject.
