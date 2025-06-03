.class public Lx0/K$a;
.super LF0/D;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/K;->V()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lx0/K;


# direct methods
.method public constructor <init>(Lx0/K;LF0/M;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx0/K$a;->b:Lx0/K;

    .line 2
    .line 3
    invoke-direct {p0, p2}, LF0/D;-><init>(LF0/M;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public l()J
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/K$a;->b:Lx0/K;

    .line 2
    .line 3
    invoke-static {v0}, Lx0/K;->F(Lx0/K;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method
