/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jackrabbit.rmi;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.apache.jackrabbit.test.JCRTestSuite;

/**
 * @deprecated RMI support is deprecated and will be removed in a future version of Jackrabbit; see <a href=https://issues.apache.org/jira/browse/JCR-4972 target=_blank>Jira ticket JCR-4972</a> for more information.
 * <p>
 * JCR API conformance test suite.
 */
@Deprecated(forRemoval = true) public class ConformanceTest extends TestCase {

    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        if (Boolean.getBoolean("jackrabbit.test.integration")) {
            suite.addTest(new JCRTestSuite());
        }
        return suite;
    }

}
