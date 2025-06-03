.class public final synthetic Lr9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final a:Lr9/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr9/b;

    invoke-direct {v0}, Lr9/b;-><init>()V

    sput-object v0, Lr9/b;->a:Lr9/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method
