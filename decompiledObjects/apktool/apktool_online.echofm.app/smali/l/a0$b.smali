.class public Ll/a0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Ll/a0;


# direct methods
.method public constructor <init>(Ll/a0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll/a0$b;->o:Ll/a0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Ll/a0$b;->o:Ll/a0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll/a0;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
