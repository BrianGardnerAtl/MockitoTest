package com.bgardner.mockitotest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 23, constants = BuildConfig.class)
public class UserTest {

    @Test
    public void canMockUserId() {
        User user = mock(User.class);
        when(user.getId()).thenReturn(1);
        assertThat(user.getId(), equalTo(1));
    }
}
