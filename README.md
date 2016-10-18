## Mockito Final Mocking Issue

This project reproduces an issue with the new final class mocking in Mockito 2.
It is a basic Android project with a single User class that contains a single ID
field. There is also a single unit test called UserTest that attempts to mock
out the user's ID and verify its state.

Running the test with the RobolectricTestRunner causes the test to crash when
the mock() method is called. Changing the test runner to the JUnit4 class makes
the test pass.
