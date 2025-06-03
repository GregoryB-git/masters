.class public final synthetic Lk0/S0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lk0/T0$a;

.field public final synthetic p:Landroid/util/Pair;


# direct methods
.method public synthetic constructor <init>(Lk0/T0$a;Landroid/util/Pair;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk0/S0;->o:Lk0/T0$a;

    .line 5
    .line 6
    iput-object p2, p0, Lk0/S0;->p:Landroid/util/Pair;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/S0;->o:Lk0/T0$a;

    .line 2
    .line 3
    iget-object v1, p0, Lk0/S0;->p:Landroid/util/Pair;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lk0/T0$a;->j(Lk0/T0$a;Landroid/util/Pair;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
