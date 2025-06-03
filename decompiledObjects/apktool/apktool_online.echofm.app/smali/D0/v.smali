.class public final synthetic LD0/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LD0/E$a;

.field public final synthetic p:Ld0/P;


# direct methods
.method public synthetic constructor <init>(LD0/E$a;Ld0/P;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LD0/v;->o:LD0/E$a;

    .line 5
    .line 6
    iput-object p2, p0, LD0/v;->p:Ld0/P;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LD0/v;->o:LD0/E$a;

    .line 2
    .line 3
    iget-object v1, p0, LD0/v;->p:Ld0/P;

    .line 4
    .line 5
    invoke-static {v0, v1}, LD0/E$a;->f(LD0/E$a;Ld0/P;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
