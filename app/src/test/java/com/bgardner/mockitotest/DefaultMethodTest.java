package com.bgardner.mockitotest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class DefaultMethodTest {

    @Test
    public void itCanMockTheInterface() {
        Something something = mock(Something.class);
        when(something.someMethod()).thenReturn(10);

        assertThat(something.defaultBehavior(), is(equalTo(5)));
    }
}


