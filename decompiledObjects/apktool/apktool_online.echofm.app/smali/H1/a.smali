.class public final LH1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH1/a$a;
    }
.end annotation


# static fields
.field public static final d:LH1/a$a;


# instance fields
.field public a:[I

.field public b:I

.field public c:[F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LH1/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LH1/a$a;-><init>(Lkotlin/jvm/internal/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LH1/a;->d:LH1/a$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>([I)V
    .locals 1

    .line 1
    const-string v0, "shape"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LH1/a;->a:[I

    .line 10
    .line 11
    sget-object v0, LH1/a;->d:LH1/a$a;

    .line 12
    .line 13
    invoke-static {v0, p1}, LH1/a$a;->a(LH1/a$a;[I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, LH1/a;->b:I

    .line 18
    .line 19
    new-array p1, p1, [F

    .line 20
    .line 21
    iput-object p1, p0, LH1/a;->c:[F

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a()[F
    .locals 1

    .line 1
    iget-object v0, p0, LH1/a;->c:[F

    .line 2
    .line 3
    return-object v0
.end method

.method public final b(I)I
    .locals 1

    .line 1
    iget-object v0, p0, LH1/a;->a:[I

    .line 2
    .line 3
    aget p1, v0, p1

    .line 4
    .line 5
    return p1
.end method

.method public final c()I
    .locals 1

    .line 1
    iget-object v0, p0, LH1/a;->a:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    return v0
.end method

.method public final d([I)V
    .locals 4

    .line 1
    const-string v0, "shape"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LH1/a;->a:[I

    .line 7
    .line 8
    sget-object v0, LH1/a;->d:LH1/a$a;

    .line 9
    .line 10
    invoke-static {v0, p1}, LH1/a$a;->a(LH1/a$a;[I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    new-array v0, p1, [F

    .line 15
    .line 16
    iget-object v1, p0, LH1/a;->c:[F

    .line 17
    .line 18
    iget v2, p0, LH1/a;->b:I

    .line 19
    .line 20
    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, LH1/a;->c:[F

    .line 29
    .line 30
    iput p1, p0, LH1/a;->b:I

    .line 31
    .line 32
    return-void
.end method
