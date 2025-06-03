.class public abstract Ly0/a;
.super Ly0/m;
.source "SourceFile"


# instance fields
.field public final k:J

.field public final l:J

.field public m:Ly0/c;

.field public n:[I


# direct methods
.method public constructor <init>(Li0/g;Li0/k;Ld0/q;ILjava/lang/Object;JJJJJ)V
    .locals 13

    .line 1
    move-object v12, p0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    move/from16 v4, p4

    .line 8
    .line 9
    move-object/from16 v5, p5

    .line 10
    .line 11
    move-wide/from16 v6, p6

    .line 12
    .line 13
    move-wide/from16 v8, p8

    .line 14
    .line 15
    move-wide/from16 v10, p14

    .line 16
    .line 17
    invoke-direct/range {v0 .. v11}, Ly0/m;-><init>(Li0/g;Li0/k;Ld0/q;ILjava/lang/Object;JJJ)V

    .line 18
    .line 19
    .line 20
    move-wide/from16 v0, p10

    .line 21
    .line 22
    iput-wide v0, v12, Ly0/a;->k:J

    .line 23
    .line 24
    move-wide/from16 v0, p12

    .line 25
    .line 26
    iput-wide v0, v12, Ly0/a;->l:J

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final i(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Ly0/a;->n:[I

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [I

    .line 8
    .line 9
    aget p1, v0, p1

    .line 10
    .line 11
    return p1
.end method

.method public final j()Ly0/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ly0/a;->m:Ly0/c;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ly0/c;

    .line 8
    .line 9
    return-object v0
.end method

.method public k(Ly0/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly0/a;->m:Ly0/c;

    .line 2
    .line 3
    invoke-virtual {p1}, Ly0/c;->b()[I

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iput-object p1, p0, Ly0/a;->n:[I

    .line 8
    .line 9
    return-void
.end method
