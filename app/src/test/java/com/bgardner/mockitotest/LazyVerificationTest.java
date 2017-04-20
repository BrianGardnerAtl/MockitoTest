package com.bgardner.mockitotest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.VerificationCollector;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(JUnit4.class)
public class LazyVerificationTest {
    @Rule
    public VerificationCollector mCollector = MockitoJUnit.collector();

    @Test
    public void itCollectsAllVerificationErrors() {
        // This should display both verification errors instead of just the first one
        User user = mock(User.class);
        verify(user).getId();
        verify(user).getName();
    }
}
