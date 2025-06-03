.class public final enum Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PersistenceCacheIndexManagerRequest"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;

.field public static final enum DELETE_ALL_INDEXES:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;

.field public static final enum DISABLE_INDEX_AUTO_CREATION:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;

.field public static final enum ENABLE_INDEX_AUTO_CREATION:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;


# instance fields
.field public final index:I


# direct methods
.method private static synthetic $values()[Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;

    sget-object v1, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;->ENABLE_INDEX_AUTO_CREATION:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;->DISABLE_INDEX_AUTO_CREATION:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;->DELETE_ALL_INDEXES:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;

    const-string v1, "ENABLE_INDEX_AUTO_CREATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;->ENABLE_INDEX_AUTO_CREATION:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;

    new-instance v0, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;

    const-string v1, "DISABLE_INDEX_AUTO_CREATION"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;->DISABLE_INDEX_AUTO_CREATION:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;

    new-instance v0, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;

    const-string v1, "DELETE_ALL_INDEXES"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;->DELETE_ALL_INDEXES:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;

    invoke-static {}, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;->$values()[Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;

    move-result-object v0

    sput-object v0, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;->$VALUES:[Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;->index:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;
    .locals 1

    const-class v0, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;

    return-object p0
.end method

.method public static values()[Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;
    .locals 1

    sget-object v0, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;->$VALUES:[Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;

    invoke-virtual {v0}, [Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;

    return-object v0
.end method
