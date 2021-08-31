/*
 * Copyright (C) 2021 Rick Busarow
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tangle.sample.app.tests

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import tangle.sample.ui.composeWithFragments.ComposeWithFragmentsMainActivity

@RunWith(AndroidJUnit4::class)
class ComposeFragmentsIntegrationTest {

  @get:Rule
  val testRule = createAndroidComposeRule(ComposeWithFragmentsMainActivity::class.java)

  @Test
  fun selected_item_is_passed_to_next_screen() {

    testRule.onNodeWithText("Goldendoodle").performClick()

    testRule.onNodeWithText("awesome temperament").assertIsDisplayed()
  }
}