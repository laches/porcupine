/*
 * Copyright 2015 Adam Bien.
 *
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
package com.airhacks.porcupine.execution.control;

import javax.enterprise.concurrent.ManagedThreadFactory;
import javax.enterprise.inject.Produces;

/**
 *
 * @author airhacks.com
 */
public class ManagedThreadFactoryExposerMock {

    @Produces
    public ManagedThreadFactory expose() {
        return (r) -> newThread(r);
    }

    Thread newThread(Runnable r) {
        Thread thread = new Thread(r, "-ManagedThreadFactoryExposerMock-");
        thread.setDaemon(false);
        return thread;
    }
}
