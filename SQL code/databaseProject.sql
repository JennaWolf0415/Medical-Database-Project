DROP DATABASE MedicalEquipment;
CREATE DATABASE MedicalEquipment;

USE MedicalEquipment;

CREATE TABLE equipment (
	name VARCHAR(50) NOT NULL UNIQUE,
    id int NOT NULL UNIQUE,
    manufacturer VARCHAR(50) NOT NULL,
    description VARCHAR(250) NOT NULL,
    rent_price decimal(10,2) NOT NULL,
    quantity int NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE suppliers (
	sup_id int NOT NULL UNIQUE,
    name VARCHAR(50) NOT NULL,
    address VARCHAR(75) NOT NULL,
    PRIMARY KEY (sup_id)
);

CREATE TABLE stock (
	stock_id int NOT NULL UNIQUE,
    sup_id int NOT NULL,
    equip_id int NOT NULL,
	PRIMARY KEY (stock_id),
    FOREIGN KEY (sup_id) REFERENCES suppliers (sup_id)
		ON DELETE CASCADE
        ON UPDATE CASCADE,
    FOREIGN KEY (equip_id) REFERENCES equipment (id)
		ON DELETE CASCADE
        ON UPDATE CASCADE
);

CREATE TABLE clients (
	name VARCHAR(50) NOT NULL,
    address VARCHAR(75) NOT NULL,
    phone VARCHAR(10) NOT NULL,
    client_id int NOT NULL UNIQUE,
    password VARCHAR(25) NOT NULL,
    PRIMARY KEY (Client_id)
);

CREATE TABLE Rentals (
	Rental_id int NOT NULL UNIQUE,
	client_id int NOT NULL,
    equipment_id int NOT NULL,
    startDate date NOT NULL,
    endDate date NOT NULL,
    quantity int NOT NULL,
    totalPrice decimal(10,2) NOT NULL,
    paid boolean NOT NULL,
    PRIMARY KEY (Rental_id),
    FOREIGN KEY (client_id) REFERENCES clients (client_id)
		ON DELETE CASCADE
        ON UPDATE CASCADE,
	FOREIGN KEY (equipment_id) REFERENCES equipment (id)
		ON DELETE CASCADE
        ON UPDATE CASCADE
);

INSERT INTO Equipment (name, id, manufacturer, description, rent_price, quantity)
VALUES ('Walker', 101, 'HealthyEquiped', 'Device that gives support for balance/stability while walking', 7.50, 15),
	('Rollator', 102, 'HealthyEquiped', 'A Walker with a seat and more wheels, allowing a person more support while walking', 9.50, 10),
    ('Knee Walker/Scooter', 103, 'HealthyEquiped', 'A walker that allows a person to rest one leg/knee on it while using their other leg', 10.50, 10),
    ('Wheelchair', 104, 'EasyMove', 'A chair with two or more wheels that allows a person to move while sitting. For those who struggle to stand or walk.', 18.00, 25),
    ('Crutches', 105, 'EasyMove', 'A mobility aid that transfers weight from the legs to the upper body, allowing people who cannot use their legs to support their own weight', 4.00, 25),
    ('Cane', 106, 'EasyMove', 'A mobility aid that allows a person more blance/stability while walking. Used for those who have minor problems while walking', 2.25, 30),
    ('Shower Chair', 107, 'WECAREBEARS', 'A chair for the shower, allowing a person to sit while bathing.', 4.75, 10),
    ('Bath bench', 108, 'WECAREBEARS', 'A seat for the bath, allowing a person to stay seated while getting in or out of the bath', 4.25, 10),
    ('Blood Pressure Monitor', 109, 'MedicalNeeds', 'A device used to measure the blood pressure of a person. Can be used to see if someone has high or low blood pressure among other important information', 3.00, 10),
    ('Hosptial Bed', 110, 'HelpRUs', 'A bed specially designed for a hospital/people who are injured or sick. Includes features that focus on the comfort or well-being of a injured/sick person', 65.75, 15),
    ('Hospital Bed with Bed Rails and Trapeze', 111, 'HelpRUs', 'A hospital bed with extra equipment added on that allows those in the bed to move around or get up easier', 74.00, 10),
    ('Raised Toilet Seats/Toilet Riser', 112, 'WECAREBEARS', 'A device that adds rails around a toilet, allowing people with movement issues to get on and off a toilet easier', 5.00, 10),
    ('Bedside Commode', 113, 'WECAREBEARS', 'A portable toilet, used for when someone is stuck in a bed and cannot make it to the bathroom', 7.75, 15),
    ('Patient Lift', 114, 'EasyMove', 'A device used to raise patients up and down from one place to another eaiser', 8.00, 5),
    ('Transfer Board', 115, 'HelpRUs', 'A device used to allow people with physical disabilities to move from one surface to another easier', 3.25, 5),
    ('Hip Kit Items', 116, 'WECAREBEARS', 'A six-piece set of ttols that can assist a person with daily tasks when recovering from hip replacement surgery. Includes a sock aid, reacher, long-handled shoehorn, bath sponge, dressing stick, and a set of elastic shoelaces', 2.50, 20),
    ('Portable Ramp', 117, 'EasyMove', 'A ramp made for wheel chairs and other devices that cannot go up curbs, edges, or stairs easily. Laid down so these pieces of equipment can easily go up or down different surface', 9.75, 10);

	INSERT INTO suppliers (sup_id, name, address)
    VALUES (1001 ,'WeHelpYou', '1234 help lane'),
		(1002 ,'ArminArms', '435 arms court'),
		(1003 ,'GiveBackGiveLocal', '9876 goodwill place'),
		(1004 ,'Walmart', '453 helpful place'),
		(1005 ,'Amazon', '643 jeff drive'),
		(1006 ,'ChildrensHelp', '2312 hospital road'),
		(1007 ,'ChurchesForYou', '978 allen court'),
		(1008 ,'Target', '2343 bullseye street'),
		(1009 ,'LeftForYou', '982 here drive'),
		(1010 ,'FreedomFighters', '4444 july road'),
		(1011 ,'DonationsGlobal', '687 giveback street'),
		(1012 ,'TJMax', '234 white lane'),
		(1013 ,'Marshals', '863 something street'),
		(1014 ,'HobbyLobby', '2345 craft place'),
		(1015 ,'DatabaseHelpers', '768 computer court');

INSERT INTO stock (stock_id, sup_id, equip_id)
VALUES ( 435, 1001, 101),
	( 654, 1001, 105),
	( 765, 1002, 116),
    ( 945, 1003, 107),
    ( 675, 1003, 108),
    ( 834, 1003, 112),
    ( 521, 1004, 110),
    ( 625, 1004, 111),
    ( 869, 1005, 114),
    ( 456, 1005, 117),
    ( 981, 1006, 113),
    ( 490, 1007, 106),
    ( 769, 1008, 109),
    ( 533, 1008, 101),
    ( 611, 1008, 102),
    ( 597, 1008, 103),
    ( 994, 1009, 104),
    ( 547, 1010, 110),
    ( 867, 1011, 115),
    ( 517, 1011, 117),
    ( 544, 1012, 115),
    ( 879, 1013, 109),
    ( 912, 1013, 115),
    ( 410, 1014, 113),
    ( 403, 1015, 114);
    
    INSERT INTO clients (name, address, phone, client_id, password)
    VALUES ('Satoru Gojo', '123 Sorcerer Street', '123456789', 201, 'Yowaimo!'),
		('Yuji Itadori', '876 Finger Drive', '6667775555', 203, 'password'),
        ('Fushigoro Megumi', '783 Dogwood Place', '4442229999', 205, 'dogs564!@'),
        ('Kugisaki Nobara', '876 Rose Avenue', '5454545454', 207, 'roses34'),
        ('Kento Nanami', '324 Perfect Court', '987654321', 209, '765894!@#@'),
        ('Maki Zenin', '987 Burn Drive', '3243243243', 211, 'twinstars101'),
        ('Toge Inumaki', '234 Speech Street', '6547346547', 213, 'bonitoFlakes'),
        ('Sugaru Geto', '156 Turned Drive', '2223334444', 215, 'cursed!man!564'),
        ('Yuta Okkotsu', '712 Friends Avenue', '9998887777', 217, 'Rika!!1204'),
        ('Ryomen Sukuna', '895 Cursed Court', '4327869543', 219, 'password'),
        ('Ieiri Shoko', '876 Health Drive', '6576576576', 221, '8745Medical23'),
        ('Iori Utahime', '876 Scared Street', '3452213209', 223, 'Hey!54'),
        ('Mai Zenin', '234 Twin Avenue', '9088797689', 225, '653twinstars'),
        ('Aoi Todo', '654 Boogie Place', '6661112222', 227, 'idolman23!'),
        ('Yuki Tsukumo', '434 Pretty Place', '3452765987', 229, 'theBest!');
        
	INSERT INTO rentals (Rental_id, client_id, equipment_id, startDate, endDate, quantity, totalPrice, paid)
    VALUES (1111, 201, 113, '2024-07-07', '2024-07-10', 2, 62.00, false),
		(1122, 201, 117, '2024-07-07', '2024-07-10', 1, 39, false),
        (1133, 213, 113, '2024-07-10', '2024-07-19', 1, 77.50, true),
        (1144, 229, 102, '2024-07-08', '2024-07-14', 4, 266.00, false),
        (1155, 207, 107, '2024-08-10', '2024-08-14', 2, 47.50, true),
        (1166, 207, 116, '2024-08-10', '2024-08-14', 2, 25.00, true),
        (1177, 207, 104, '2024-08-10', '2024-08-14', 2, 180.00, true),
        (1188, 213, 110, '2024-07-14', '2024-07-30', 5, 5260.00, false),
        (1199, 227, 114, '2024-07-09', '2024-07-10', 1, 16.00, false),
        (1211, 203, 117, '2024-07-07', '2024-08-10', 1, 341.25, true),
        (1222, 209, 102, '2024-07-14', '2024-07-21', 3, 228.0, true),
        (1233, 209, 101, '2024-07-22', '2024-07-27', 3, 157.5, true),
        (1244, 225, 105, '2024-07-07', '2024-08-15', 1, 160.00, false),
        (1255, 215, 108, '2024-07-28', '2024-08-13', 5, 361.25, false);
  
