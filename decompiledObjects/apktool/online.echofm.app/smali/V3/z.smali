.class public interface abstract LV3/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LV3/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LV3/z$a;

    .line 2
    .line 3
    invoke-direct {v0}, LV3/z$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LV3/z;->a:LV3/z;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Thread;Ljava/lang/String;)V
.end method

.method public abstract b(Ljava/lang/Thread;Z)V
.end method

.method public abstract c(Ljava/lang/Thread;Ljava/lang/Thread$UncaughtExceptionHandler;)V
.end method
