.class public final synthetic LK4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LK4/c;

.field public final synthetic p:LM4/l;


# direct methods
.method public synthetic constructor <init>(LK4/c;LM4/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK4/a;->o:LK4/c;

    .line 5
    .line 6
    iput-object p2, p0, LK4/a;->p:LM4/l;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LK4/a;->o:LK4/c;

    .line 2
    .line 3
    iget-object v1, p0, LK4/a;->p:LM4/l;

    .line 4
    .line 5
    invoke-static {v0, v1}, LK4/c;->a(LK4/c;LM4/l;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
