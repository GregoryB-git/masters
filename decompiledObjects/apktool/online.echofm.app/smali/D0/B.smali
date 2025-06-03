.class public final synthetic LD0/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LD0/E$a;

.field public final synthetic p:Ld0/q;

.field public final synthetic q:Lk0/p;


# direct methods
.method public synthetic constructor <init>(LD0/E$a;Ld0/q;Lk0/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LD0/B;->o:LD0/E$a;

    .line 5
    .line 6
    iput-object p2, p0, LD0/B;->p:Ld0/q;

    .line 7
    .line 8
    iput-object p3, p0, LD0/B;->q:Lk0/p;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LD0/B;->o:LD0/E$a;

    .line 2
    .line 3
    iget-object v1, p0, LD0/B;->p:Ld0/q;

    .line 4
    .line 5
    iget-object v2, p0, LD0/B;->q:Lk0/p;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LD0/E$a;->h(LD0/E$a;Ld0/q;Lk0/p;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
