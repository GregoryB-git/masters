.class public final synthetic LC4/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LC4/x;

.field public final synthetic p:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(LC4/x;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC4/w;->o:LC4/x;

    .line 5
    .line 6
    iput-object p2, p0, LC4/w;->p:Landroid/content/Context;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LC4/w;->o:LC4/x;

    .line 2
    .line 3
    iget-object v1, p0, LC4/w;->p:Landroid/content/Context;

    .line 4
    .line 5
    invoke-static {v0, v1}, LC4/x;->a(LC4/x;Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
