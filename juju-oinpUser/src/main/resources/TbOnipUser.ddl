insert into ONIP_USER(
            oinpUserId,
            email,
            firstName,
            lastName,
            wechatId,
            userGroup,
            creation,
            startDate,
            endDate)
    values(
           '000001',
           'abc@gmail.com',
           'Jack',
           'Ma',
           'fooboo',
           'V',
           CURRENT_TIMESTAMP,
           current_date,
           current_date + 90
          );