.class public final LX4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:I

.field public c:I

.field public d:I

.field public e:LY4/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LY4/b;
    .locals 1

    .line 1
    iget-object v0, p0, LX4/a;->e:LY4/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 1
    iput p1, p0, LX4/a;->d:I

    .line 2
    .line 3
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LX4/a;->a:Z

    .line 2
    .line 3
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 1
    iput p1, p0, LX4/a;->c:I

    .line 2
    .line 3
    return-void
.end method

.method public e(LY4/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LX4/a;->e:LY4/b;

    .line 2
    .line 3
    return-void
.end method

.method public f(I)V
    .locals 0

    .line 1
    iput p1, p0, LX4/a;->b:I

    .line 2
    .line 3
    return-void
.end method
