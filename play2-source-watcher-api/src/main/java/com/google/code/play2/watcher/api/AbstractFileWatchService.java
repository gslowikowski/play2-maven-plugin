/*
 * Copyright 2013-2017 Grzegorz Slowikowski (gslowikowski at gmail dot com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.google.code.play2.watcher.api;

/**
 * An abstract base class for file watche services.
 * 
 * @author <a href="mailto:gslowikowski@gmail.com">Grzegorz Slowikowski</a>
 */
public abstract class AbstractFileWatchService
    implements FileWatchService
{
    /**
     * Logger
     */
    protected FileWatchLogger log;

    /**
     * Creates abstract file watche service.
     */
    public AbstractFileWatchService()
    {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize( FileWatchLogger log ) throws FileWatchException
    {
        this.log = log;
    }

}
