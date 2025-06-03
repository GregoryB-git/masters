.class public final synthetic LR2/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final synthetic o:LR2/J;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LR2/J;

    .line 2
    .line 3
    invoke-direct {v0}, LR2/J;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR2/J;->o:LR2/J;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/S2;->m()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
