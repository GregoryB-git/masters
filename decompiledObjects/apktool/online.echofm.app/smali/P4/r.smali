.class public LP4/r;
.super LP4/o;
.source "SourceFile"


# instance fields
.field public final p:I


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, LP4/o;-><init>(Ljava/lang/String;)V

    iput p1, p0, LP4/r;->p:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;LP4/o$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p2, p3}, LP4/o;-><init>(Ljava/lang/String;LP4/o$a;)V

    iput p1, p0, LP4/r;->p:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 3
    invoke-direct {p0, p2, p3}, LP4/o;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput p1, p0, LP4/r;->p:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LP4/o$a;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, LP4/o;-><init>(Ljava/lang/String;LP4/o$a;)V

    const/4 p1, -0x1

    iput p1, p0, LP4/r;->p:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, LP4/r;->p:I

    .line 2
    .line 3
    return v0
.end method
