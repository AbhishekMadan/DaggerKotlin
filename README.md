# DaggerKotlin
Experimenting with dagger 2 in android Kotlin project

## Notes:

- @Inject
  - This annotation is used to denote the dependencies that dagger must provide.
  - There are 3 basic type of dependency injection **Field**, **Method** and **Constructor** injection

- @Component
  - Components are used to provide the dependencies required by components/objects whose lifecycle isn't controlled by the program but instead controlled by Android. eg: Activity, Fragment.
  
  
- @Module
  - In simple terms: Modules are used to clear confusions when providing dependencies.
  - If there are 2 classes extending an interface then module is used to define when to provide which class (using named qualifiers)
  - When using a third party dependency, module is used to create the third party classes for injection.
  - If a module doesnt require any dependency i.e. if the primary module constructor is non-parameterized then dagger can initialize it on its own. However, if the module has a dependency then we need to provide that dependency and create that module when building the component.


- @Qualifiers / @Named
  - https://bloggie.io/@_junrong/dagger-2-for-android-part-iii-the-qualifier-and-named-annotation
  - Purpose is to qualify which dependency to inject if there are multiple constructs of the same type. ie if there are 5 derived classes from a subclass and the dependent class uses the super class to  hold he reference then dagger would get confused as to which subclass to inject.

- @BindsInstance
  - This annotation is used mainly in the Component's builder definition. Binding an instance is equivalent to passing an instance to a module constructor and providing that instance, but is often more efficient.
