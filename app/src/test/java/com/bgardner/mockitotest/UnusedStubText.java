package com.bgardner.mockitotest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class UnusedStubText {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Test
    public void itFindsUnusedStubs() {
        User user = mock(User.class);
        User unusedUser = mock(User.class);
        when(unusedUser.getId()).thenReturn(1);
        when(user.getId()).thenReturn(1);
        assertThat(user.getId(), is(equalTo(1)));
    }
}
