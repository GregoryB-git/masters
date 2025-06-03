.class public final synthetic Ld9/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld9/l;


# instance fields
.field public final synthetic a:Lcom/google/firebase/firestore/c;

.field public final synthetic b:Ld9/l;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/c;Ld9/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9/i;->a:Lcom/google/firebase/firestore/c;

    iput-object p2, p0, Ld9/i;->b:Ld9/l;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lcom/google/firebase/firestore/f;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Ld9/i;->a:Lcom/google/firebase/firestore/c;

    .line 6
    .line 7
    iget-object v3, v0, Ld9/i;->b:Ld9/l;

    .line 8
    .line 9
    move-object/from16 v4, p1

    .line 10
    .line 11
    check-cast v4, Lg9/s0;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v3, v5, v1}, Ld9/l;->a(Ljava/lang/Object;Lcom/google/firebase/firestore/f;)V

    .line 20
    .line 21
    .line 22
    goto :goto_3

    .line 23
    :cond_0
    const/4 v1, 0x1

    .line 24
    const/4 v6, 0x0

    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    move v7, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move v7, v6

    .line 30
    :goto_0
    new-array v8, v6, [Ljava/lang/Object;

    .line 31
    .line 32
    const-string v9, "Got event without value or error set"

    .line 33
    .line 34
    invoke-static {v9, v7, v8}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v7, v4, Lg9/s0;->b:Lj9/j;

    .line 38
    .line 39
    invoke-virtual {v7}, Lj9/j;->size()I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-gt v7, v1, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move v1, v6

    .line 47
    :goto_1
    new-array v6, v6, [Ljava/lang/Object;

    .line 48
    .line 49
    const-string v7, "Too many documents returned on a document query"

    .line 50
    .line 51
    invoke-static {v7, v1, v6}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, v4, Lg9/s0;->b:Lj9/j;

    .line 55
    .line 56
    iget-object v6, v2, Lcom/google/firebase/firestore/c;->a:Lj9/i;

    .line 57
    .line 58
    iget-object v1, v1, Lj9/j;->a:Lt8/c;

    .line 59
    .line 60
    invoke-virtual {v1, v6}, Lt8/c;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    move-object v9, v1

    .line 65
    check-cast v9, Lj9/g;

    .line 66
    .line 67
    if-eqz v9, :cond_3

    .line 68
    .line 69
    iget-object v1, v4, Lg9/s0;->f:Lt8/e;

    .line 70
    .line 71
    invoke-interface {v9}, Lj9/g;->getKey()Lj9/i;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-virtual {v1, v6}, Lt8/e;->contains(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    iget-object v7, v2, Lcom/google/firebase/firestore/c;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 80
    .line 81
    iget-boolean v10, v4, Lg9/s0;->e:Z

    .line 82
    .line 83
    new-instance v1, Lcom/google/firebase/firestore/d;

    .line 84
    .line 85
    invoke-interface {v9}, Lj9/g;->getKey()Lj9/i;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    move-object v6, v1

    .line 90
    invoke-direct/range {v6 .. v11}, Lcom/google/firebase/firestore/d;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;Lj9/i;Lj9/g;ZZ)V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    iget-object v13, v2, Lcom/google/firebase/firestore/c;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 95
    .line 96
    iget-object v14, v2, Lcom/google/firebase/firestore/c;->a:Lj9/i;

    .line 97
    .line 98
    iget-boolean v1, v4, Lg9/s0;->e:Z

    .line 99
    .line 100
    new-instance v2, Lcom/google/firebase/firestore/d;

    .line 101
    .line 102
    const/4 v15, 0x0

    .line 103
    const/16 v17, 0x0

    .line 104
    .line 105
    move-object v12, v2

    .line 106
    move/from16 v16, v1

    .line 107
    .line 108
    invoke-direct/range {v12 .. v17}, Lcom/google/firebase/firestore/d;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;Lj9/i;Lj9/g;ZZ)V

    .line 109
    .line 110
    .line 111
    move-object v1, v2

    .line 112
    :goto_2
    invoke-interface {v3, v1, v5}, Ld9/l;->a(Ljava/lang/Object;Lcom/google/firebase/firestore/f;)V

    .line 113
    .line 114
    .line 115
    :goto_3
    return-void
.end method
