def solution(id_pw, db):
    id, pw = id_pw
    db_dict = dict(db)
    
    if id not in db_dict:
        return "fail"
    elif pw != db_dict[id]:
        return "wrong pw"
    else:
        return "login"
