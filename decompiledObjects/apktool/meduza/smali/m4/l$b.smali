.class public final Lm4/l$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm4/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lc4/v;

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:I

.field public f:I

.field public g:J

.field public h:J


# direct methods
.method public constructor <init>(Lc4/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm4/l$b;->a:Lc4/v;

    return-void
.end method


# virtual methods
.method public final a([BII)V
    .locals 2

    iget-boolean v0, p0, Lm4/l$b;->c:Z

    if-eqz v0, :cond_2

    add-int/lit8 v0, p2, 0x1

    iget v1, p0, Lm4/l$b;->f:I

    sub-int/2addr v0, v1

    if-ge v0, p3, :cond_1

    aget-byte p1, p1, v0

    and-int/lit16 p1, p1, 0xc0

    shr-int/lit8 p1, p1, 0x6

    const/4 p2, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    iput-boolean p1, p0, Lm4/l$b;->d:Z

    iput-boolean p2, p0, Lm4/l$b;->c:Z

    goto :goto_1

    :cond_1
    sub-int/2addr p3, p2

    add-int/2addr p3, v1

    iput p3, p0, Lm4/l$b;->f:I

    :cond_2
    :goto_1
    return-void
.end method
