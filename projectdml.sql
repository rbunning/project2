INSERT INTO role_type(rt_id,rt_name) VALUES (1,'User');
INSERT INTO role_type(rt_id,rt_name) VALUES (2,'Scrum Master');
INSERT INTO role_type(rt_id,rt_name) VALUES (3,'Developer');
INSERT INTO role_type(rt_id,rt_name) VALUES (4,'QA');
commit;
INSERT INTO lane_type(lt_id,lt_name) VALUES (1,'Backlog');
INSERT INTO lane_type(lt_id,lt_name) VALUES (2,'To Do');
INSERT INTO lane_type(lt_id,lt_name) VALUES (3,'In Progress');
INSERT INTO lane_type(lt_id,lt_name) VALUES (4,'Test');
INSERT INTO lane_type(lt_id,lt_name) VALUES (5,'Verify');
INSERT INTO lane_type(lt_id,lt_name) VALUES (6,'Done');
commit;
INSERT INTO scrum_user(rt_id,su_fn,su_ln,su_username,su_password) VALUES (1,'Test','User','user','user');
INSERT INTO scrum_user(rt_id,su_fn,su_ln,su_username,su_password) VALUES (2,'Scrum','Master','scrum','scrum');
INSERT INTO scrum_user(rt_id,su_fn,su_ln,su_username,su_password) VALUES (3,'Test','Developer','dev','dev');
INSERT INTO scrum_user(rt_id,su_fn,su_ln,su_username,su_password) VALUES (4,'QA','Test','qa','qa');
commit;
