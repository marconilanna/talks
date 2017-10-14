/*
 * Copyright 2013 Marconi Lanna
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package models.persistence

import models.Computer

import java.util.Date

private[models] trait ComputerActiveRecord extends ActiveRecord[Computer] { this: Computer =>
  protected def dao = Computer

  private[persistence] def withId(id: PrimaryKey) = copy(id = id)
}

private[models] trait ComputerDao extends Dao[Computer] { this: Computer.type =>
  protected def table = "computer"

  protected def parse(row: Row) = Computer(
      row[PrimaryKey]("id")
    , row[String]("name")
    , row[Option[Date]]("introduced")
    , row[Option[Date]]("discontinued")
  )

  def byName(name: String) = selectMany('byName, 'name -> name)
}
