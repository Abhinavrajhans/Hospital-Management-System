-- =======================
-- Patients
-- =======================
INSERT INTO patient (name, gender, birth_date, email, blood_group)
VALUES
    ('Abhinav Rajhans', 'MALE', '2002-02-01', 'a@gmail.com', 'A_POSITIVE'),
    ('Sneha Patil', 'FEMALE', '1998-07-15', 'sneha.patil@example.com', 'B_POSITIVE'),
    ('Rohit Sharma', 'MALE', '1995-11-20', 'rohit.sharma@example.com', 'O_POSITIVE'),
    ('Neha Verma', 'FEMALE', '2000-03-10', 'neha.verma@example.com', 'AB_POSITIVE'),
    ('Amit Kumar', 'MALE', '1988-05-22', 'amit.kumar@example.com', 'A_NEGATIVE'),
    ('Priya Singh', 'FEMALE', '1992-09-05', 'priya.singh@example.com', 'O_NEGATIVE');

-- =======================
-- Doctors
-- =======================
INSERT INTO doctor (name, specialization, email, created_at)
VALUES
    ('Dr. Kulkarni', 'MD - General Medicine', 'kulkarni@gmail.com', now()),
    ('Dr. Meera Iyer', 'Pediatrics', 'meera.iyer@example.com', now()),
    ('Dr. Arjun Deshmukh', 'Orthopedics', 'arjun.deshmukh@example.com', now()),
    ('Dr. Kavita Rao', 'Dermatology', 'kavita.rao@example.com', now()),
    ('Dr. Sameer Shah', 'Cardiology', 'sameer.shah@example.com', now()),
    ('Dr. Nisha Gupta', 'Gynecology', 'nisha.gupta@example.com', now());
