Run the unit tests as `mvn clean test -D"spring.profiles.active=azure"` to use the profile called `azure`
and as `mvn clean test -D"spring.profiles.active=google"` to use the profile called `google`.  The tests
will pass with either of the profiles.  Not specifying a profile will generate an error while creating the
application context as there is no default implementation of the dependency required for the tests to run.
