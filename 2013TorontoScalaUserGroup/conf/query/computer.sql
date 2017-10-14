insert: """
insert into computer
  ( name
  , introduced
  , discontinued
  )
values
  ( {name}
  , {introduced}
  , {discontinued}
  )
"""



update: """
update computer set
    name = {name}
  , introduced = {introduced}
  , discontinued = {discontinued}
where
  id = {id}
"""



delete: """
delete from computer
where
  id = {id}
"""



select: """
select * from computer
"""



get: ${select}"""
where
  id = {id}
"""



byName: ${select}"""
where
  name = {name}
order by
  name
"""
