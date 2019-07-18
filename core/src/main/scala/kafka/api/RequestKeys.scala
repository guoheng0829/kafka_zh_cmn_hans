/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package kafka.api

/**
  * 5中类型的请求主键。
  */
object RequestKeys {
  /**
    *单一生产者
    */
  val Produce: Short = 0
  /**
    * 单一拉取消息
    */
  val Fetch: Short = 1
  /**
    * 多重拉取消息
    */
  val MultiFetch: Short = 2
  /**
    * 多生产者
    */
  val MultiProduce: Short = 3
  /**
    * 偏移量相关
    */
  val Offsets: Short = 4
}
