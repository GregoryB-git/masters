.class public final Ld0/h$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:[B

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Ld0/h$b;->a:I

    iput v0, p0, Ld0/h$b;->b:I

    iput v0, p0, Ld0/h$b;->c:I

    iput v0, p0, Ld0/h$b;->e:I

    iput v0, p0, Ld0/h$b;->f:I

    return-void
.end method

.method public constructor <init>(Ld0/h;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget v0, p1, Ld0/h;->a:I

    iput v0, p0, Ld0/h$b;->a:I

    iget v0, p1, Ld0/h;->b:I

    iput v0, p0, Ld0/h$b;->b:I

    iget v0, p1, Ld0/h;->c:I

    iput v0, p0, Ld0/h$b;->c:I

    iget-object v0, p1, Ld0/h;->d:[B

    iput-object v0, p0, Ld0/h$b;->d:[B

    iget v0, p1, Ld0/h;->e:I

    iput v0, p0, Ld0/h$b;->e:I

    iget p1, p1, Ld0/h;->f:I

    iput p1, p0, Ld0/h$b;->f:I

    return-void
.end method

.method public synthetic constructor <init>(Ld0/h;Ld0/h$a;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Ld0/h$b;-><init>(Ld0/h;)V

    return-void
.end method


# virtual methods
.method public a()Ld0/h;
    .locals 9

    .line 1
    new-instance v8, Ld0/h;

    .line 2
    .line 3
    iget v1, p0, Ld0/h$b;->a:I

    .line 4
    .line 5
    iget v2, p0, Ld0/h$b;->b:I

    .line 6
    .line 7
    iget v3, p0, Ld0/h$b;->c:I

    .line 8
    .line 9
    iget-object v4, p0, Ld0/h$b;->d:[B

    .line 10
    .line 11
    iget v5, p0, Ld0/h$b;->e:I

    .line 12
    .line 13
    iget v6, p0, Ld0/h$b;->f:I

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    move-object v0, v8

    .line 17
    invoke-direct/range {v0 .. v7}, Ld0/h;-><init>(III[BIILd0/h$a;)V

    .line 18
    .line 19
    .line 20
    return-object v8
.end method

.method public b(I)Ld0/h$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/h$b;->f:I

    .line 2
    .line 3
    return-object p0
.end method

.method public c(I)Ld0/h$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/h$b;->b:I

    .line 2
    .line 3
    return-object p0
.end method

.method public d(I)Ld0/h$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/h$b;->a:I

    .line 2
    .line 3
    return-object p0
.end method

.method public e(I)Ld0/h$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/h$b;->c:I

    .line 2
    .line 3
    return-object p0
.end method

.method public f([B)Ld0/h$b;
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/h$b;->d:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public g(I)Ld0/h$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/h$b;->e:I

    .line 2
    .line 3
    return-object p0
.end method
