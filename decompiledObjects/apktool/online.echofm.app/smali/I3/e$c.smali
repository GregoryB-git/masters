.class public final LI3/e$c;
.super Ljava/io/InputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public o:I

.field public p:I

.field public final synthetic q:LI3/e;


# direct methods
.method public constructor <init>(LI3/e;LI3/e$b;)V
    .locals 1

    .line 1
    iput-object p1, p0, LI3/e$c;->q:LI3/e;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    iget v0, p2, LI3/e$b;->a:I

    add-int/lit8 v0, v0, 0x4

    invoke-static {p1, v0}, LI3/e;->a(LI3/e;I)I

    move-result p1

    iput p1, p0, LI3/e$c;->o:I

    iget p1, p2, LI3/e$b;->b:I

    iput p1, p0, LI3/e$c;->p:I

    return-void
.end method

.method public synthetic constructor <init>(LI3/e;LI3/e$b;LI3/e$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, LI3/e$c;-><init>(LI3/e;LI3/e$b;)V

    return-void
.end method


# virtual methods
.method public read()I
    .locals 3

    .line 1
    iget v0, p0, LI3/e$c;->p:I

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    iget-object v0, p0, LI3/e$c;->q:LI3/e;

    invoke-static {v0}, LI3/e;->e(LI3/e;)Ljava/io/RandomAccessFile;

    move-result-object v0

    iget v1, p0, LI3/e$c;->o:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    iget-object v0, p0, LI3/e$c;->q:LI3/e;

    invoke-static {v0}, LI3/e;->e(LI3/e;)Ljava/io/RandomAccessFile;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->read()I

    move-result v0

    iget-object v1, p0, LI3/e$c;->q:LI3/e;

    iget v2, p0, LI3/e$c;->o:I

    add-int/lit8 v2, v2, 0x1

    invoke-static {v1, v2}, LI3/e;->a(LI3/e;I)I

    move-result v1

    iput v1, p0, LI3/e$c;->o:I

    iget v1, p0, LI3/e$c;->p:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, LI3/e$c;->p:I

    return v0
.end method

.method public read([BII)I
    .locals 2

    .line 2
    const-string v0, "buffer"

    invoke-static {p1, v0}, LI3/e;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    or-int v0, p2, p3

    if-ltz v0, :cond_2

    array-length v0, p1

    sub-int/2addr v0, p2

    if-gt p3, v0, :cond_2

    iget v0, p0, LI3/e$c;->p:I

    if-lez v0, :cond_1

    if-le p3, v0, :cond_0

    move p3, v0

    :cond_0
    iget-object v0, p0, LI3/e$c;->q:LI3/e;

    iget v1, p0, LI3/e$c;->o:I

    invoke-static {v0, v1, p1, p2, p3}, LI3/e;->c(LI3/e;I[BII)V

    iget-object p1, p0, LI3/e$c;->q:LI3/e;

    iget p2, p0, LI3/e$c;->o:I

    add-int/2addr p2, p3

    invoke-static {p1, p2}, LI3/e;->a(LI3/e;I)I

    move-result p1

    iput p1, p0, LI3/e$c;->o:I

    iget p1, p0, LI3/e$c;->p:I

    sub-int/2addr p1, p3

    iput p1, p0, LI3/e$c;->p:I

    return p3

    :cond_1
    const/4 p1, -0x1

    return p1

    :cond_2
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw p1
.end method
