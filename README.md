## Mockito Final Mocking Issue

This project reproduces an issue with the new final class mocking in Mockito 2.
It is a basic Android project with a single User class that contains a single ID
field. There is also a single unit test called UserTest that attempts to mock
out the user's ID and verify its state.

Running the test with the RobolectricTestRunner causes the test to crash when
the mock() method is called. Changing the test runner to the JUnit4 class makes
the test pass.

### Stack Trace
``` java

java.lang.ExceptionInInitializerError
	at org.mockito.internal.exceptions.stacktrace.ConditionalStackTraceFilter.<init>(ConditionalStackTraceFilter.java:17)
	at org.mockito.exceptions.base.MockitoException.filterStackTrace(MockitoException.java:41)
	at org.mockito.exceptions.base.MockitoException.<init>(MockitoException.java:35)
	at org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker.<init>(InlineByteBuddyMockMaker.java:120)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
	at java.lang.Class.newInstance(Class.java:442)
	at org.mockito.internal.configuration.plugins.PluginLoader.loadImpl(PluginLoader.java:77)
	at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:36)
	at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:13)
	at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:12)
	at org.mockito.internal.util.MockUtil.<clinit>(MockUtil.java:24)
	at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
	at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:168)
	at org.mockito.internal.creation.MockSettingsImpl.confirm(MockSettingsImpl.java:162)
	at org.mockito.internal.MockitoCore.mock(MockitoCore.java:62)
	at org.mockito.Mockito.mock(Mockito.java:1629)
	at org.mockito.Mockito.mock(Mockito.java:1542)
	at com.bgardner.mockitotest.UserTest.canMockUserId(UserTest.java:19)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.robolectric.RobolectricTestRunner$HelperTestRunner$1.evaluate(RobolectricTestRunner.java:467)
	at org.robolectric.RobolectricTestRunner$2.evaluate(RobolectricTestRunner.java:250)
	at org.robolectric.RobolectricTestRunner.runChild(RobolectricTestRunner.java:176)
	at org.robolectric.RobolectricTestRunner.runChild(RobolectricTestRunner.java:49)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.robolectric.RobolectricTestRunner$1.evaluate(RobolectricTestRunner.java:142)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:119)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:42)
	at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:234)
	at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:74)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)
Caused by: java.lang.NullPointerException
	at org.mockito.internal.configuration.plugins.Plugins.getStackTraceCleanerProvider(Plugins.java:18)
	at org.mockito.internal.exceptions.stacktrace.StackTraceFilter.<clinit>(StackTraceFilter.java:19)
	... 50 more

```
