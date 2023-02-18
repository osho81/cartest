-- CREATE TABLE cartestdb.cars (regnr varchar(255), model varchar(255), model_year int, daily_sek double);


INSERT INTO car_rental_db.cars (regnr, model, model_year, daily_sek)
VALUES ('abb999', 'Mercedes', 2018, 500),
       ('bal999', 'Audi', 2015, 400),
       ('cbb999', 'Bmw', 2011, 300);

-- USED with BigQuery dataset:
-- INSERT INTO car_rental_dataset.cars (regNr, model, modelYear, dailySek)
-- VALUES ('abb122', 'Mercedes', 2018, 500),
--        ('bal457', 'Audi', 2015, 400),
--        ('cbb555', 'Bmw', 2011, 300),
--        ('dda222', 'Volvo', 2022, 600),
--        ('jjj121w', 'Mercedesssw', 2022, 650);