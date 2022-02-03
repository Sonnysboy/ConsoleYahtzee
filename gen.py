def die_face(faces_count, roll, eyes='o '):
    """Return the full face of the roll for a faces_count-sided die."""

    # Build a proper die pattern according to faces_count
    if faces_count > 12:
        limit, pattern = 20, '---------\n|{} {} {} {}|\n|{} {} {} {}|\n|{} {}'

    elif faces_count > 6:
        limit, pattern = 12, ' ------- \n|{} {} {} {}|\n|{} {}'

    else:
        limit, pattern = 6, '+-----+\n| {} {} |\n| {}'

    # Fill the pattern with correct eye for current roll
    upper_die = pattern.format(*(eyes[roll<i] for i in range(1, limit, 2)))

    # Return mirrored pattern string with changing middle to get a full face
    return upper_die + eyes[roll&1] + upper_die[::-1]
# print(",".join(map(lambda x: "\"" + x + "\"",(die_face(1, 1).split("\n")))))
print("\""+die_face(10, 9).replace("\n", "\\n") + "\"")