.class public final synthetic LD0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LD0/d$h;

.field public final synthetic p:LD0/F$a;

.field public final synthetic q:Ld0/P;


# direct methods
.method public synthetic constructor <init>(LD0/d$h;LD0/F$a;Ld0/P;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LD0/f;->o:LD0/d$h;

    .line 5
    .line 6
    iput-object p2, p0, LD0/f;->p:LD0/F$a;

    .line 7
    .line 8
    iput-object p3, p0, LD0/f;->q:Ld0/P;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LD0/f;->o:LD0/d$h;

    .line 2
    .line 3
    iget-object v1, p0, LD0/f;->p:LD0/F$a;

    .line 4
    .line 5
    iget-object v2, p0, LD0/f;->q:Ld0/P;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LD0/d$h;->i(LD0/d$h;LD0/F$a;Ld0/P;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
